package repository;

import models.library.*;

import java.util.ArrayList;
import java.util.List;
import utils.DateFormat;

public class LoanRepository {

    private static List<Loan> instance = null;

    public LoanRepository() {

    }

    public static List<Loan> getInstance() {
        if (instance == null) {
            synchronized (LoanRepository.class) {
                if (instance == null) {
                    instance = new ArrayList<Loan>();
                }
            }
        }
        return instance;
    }

    public static void addLoan(Loan loan) {
        instance.add(loan);
    }

    public static Loan getLoanByFineId(int fineId) {
        for (Loan loan : instance) {
            int currentFineId = loan.getFine().getId();
            System.out.println(currentFineId);

            if (currentFineId == fineId)
                return loan;
        }
        return null;
    }
    
    public static boolean returnLoan(Loan loanToReturn) {
        for (Loan loan : instance) {
            if(loan.equals(loanToReturn)){
                loan.setStatus(StatusLoan.RETURNED); 
                return true;
            }
        }
        return false;
    }

    public static List<Loan> getLoanCloseToReturnDate(DateFormat firstDate, DateFormat pickedDate) {
        List<Loan> closeToReturnDate = new ArrayList<Loan>();
        DateFormat.getQuantityOfDaysAfterToday(pickedDate);
        
        for (Loan loan : instance) {           
            List<DateFormat> days = DateFormat.getDatesBetween(firstDate, pickedDate);
            
            if (days.contains(loan.getReturnDate()) && loan.getStatus().equals(StatusLoan.LOANED)) {
                closeToReturnDate.add(loan);
            }
        }
        
        return closeToReturnDate;
    }
    

    public static void getAll() {
        for (Loan loan : instance) {
            System.out.println("\n\n"+ loan.toString());
        }
    }

}
