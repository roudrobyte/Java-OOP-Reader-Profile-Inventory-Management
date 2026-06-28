public class Reader {
    public String name;
    public int cap;
    public String[] books;
    public int count = 0;

    public void createReader(String name, int cap) {
        this.name = name;
        this.cap = cap;
        this.books = new String[cap];
    }

    public void readerInfo(){
        System.out.println("Name: "+name);
        System.out.println("Capacity: "+cap);
        System.out.println("Books: ");

        if(!(count>0)){
            System.out.println("No books added yet");
        }
        else{
            for(int j=0;j<count;j++){
                System.out.println("Book "+(j+1)+": "+books[j]);
            }
        }
    }

    public void updateCapacity(int cap) {
        this.cap = cap;
        String [] arr = new String[cap];

        for(int i=0;i<count;i++){
            arr[i] = books[i];
        }
        this.books = arr;
        System.out.println(name+ "'s capacity updated to "+cap);
    }

    public void addBook(String book){
        count++;
        if(count>cap){
            System.out.println("No more space for new book");
            count--;
        }
        else{
            books[count-1] = book;
        }
    }
}
