import java.util.Optional;

class Two {
    byte x;
}

 public class PassO {
    public static void main(String[] args) {
        PassO p = new PassO();
        p.start();
    }

    void start() {
        Two t = new Two();
        System.out.print(t.x + " ");
        Optional<Two> optionalT = fix(Optional.of(t));
        System.out.println(t.x + " " + optionalT.get().x);
    }

    Optional<Two> fix(Optional<Two> optionalT) {
        optionalT.ifPresent(tt -> tt.x = 42);
        return optionalT;
    }
}
