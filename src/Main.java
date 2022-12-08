
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        BigDecimal decimal = new BigDecimal("100");
        Note note = new Note("123456789", date, NoteType.IDEAS, "Some ideas");
        note.makeARecord(note);
        Contacts contacts = new Contacts("Контакт", date, NoteType.IDEAS, "0701 11-11-01",
                "Sasha", TypeOfNumber.MOBILE);
        contacts.makeARecord(note);
        Duty duty = new Duty("Торчит сотку", date, NoteType.DUTY, decimal);
        duty.makeARecord(note);
    }
}