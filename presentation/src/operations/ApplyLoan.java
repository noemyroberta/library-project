package operations;

import models.auth.User;
import models.library.Book;
import models.library.Copy;
import models.library.Loan;
import repository.LoanRepository;
import repository.MaterialRepository;

public class ApplyLoan implements IApplyLoan {
    
    @Override
    public void call(String materialType, String ISBN) {
        LoanRepository.getInstance();
        MaterialRepository.getInstance();
        
        User user = User.getInstance();
        Loan loan;
        
        assert ISBN != null;
        if (materialType.equals("Livro")) {
            Book book = (Book) MaterialRepository.searchMaterialByISBN(ISBN);
            book.setQuantity(book.getQuantity()-1);
            loan = new Loan(user, book);
            System.out.println("Livro="+loan.toString());
        } else {
            Copy copy = (Copy) MaterialRepository.searchMaterialByISBN(ISBN);
            copy.setQuantity(copy.getQuantity()-1);
            loan = new Loan(user, copy);
            System.out.println("Exemplar="+loan.toString());
        }
        
        LoanRepository.addLoan(loan); 
    }
}
