package production.test.thinkinginjava;

 public class Transmogrify {
    public static void main(String[] args){
        Stage stage = new Stage();
        stage.performPlay();;
        stage.change();
        stage.performPlay();

        Sequence a = new Sequence(10);
        Sequence.SecquenceSelector y = a.new SecquenceSelector();
    }
}
