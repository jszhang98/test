package production.test.thinkinginjava;

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){
        items = new Object[size];
    }
    public void add(Object x){
        if(next< items.length){
            items[next++]=x;
        }
    }
    class SecquenceSelector implements Selector{

        private int i = 0;
        @Override
        public Boolean end() {
            return i == Sequence.this.items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
           if(i<items.length){
               i++;
           }

        }
    }
    public Selector selector(){
        return new SecquenceSelector();
    }
    public static void main(String[] args){
        Sequence sequence = new Sequence(10);
        for(int i = 0; i<10;i++){
            sequence.add(Integer.toString(i));
        }
       Selector selector = sequence.selector();
       while(!selector.end()){
           System.out.println(selector.current().toString()+" ");
           selector.next();
       }
    }
}
