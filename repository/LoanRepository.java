package repository;

import models.library.*;

import java.util.ArrayList;
import java.util.List;

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


    public static void getAll() {
        for (Loan loan : instance) {
            System.out.println("\n\n"+ loan.toString());
        }
    }

}
