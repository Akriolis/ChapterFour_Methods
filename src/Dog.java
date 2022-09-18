public class Dog {
    private int size;
    private String name;

    void bark (int numOfBarks){
        while (numOfBarks > 0){
            if (size > 60){
                System.out.println("Woof! Woof!");
            } else if (size > 20){
                System.out.println("Auf! Auf!");
            } else {
                System.out.println("Yip! Yip!");
            }
            numOfBarks -= 1;
        }
    }

    public void setSize(int size){
        if (size > 0){
            this.size = size;
        } else{
            System.out.println("Size can't be lower than zero");
        }

    }

    public void setName(String name){
        if (name.trim().length() > 0){
            this.name = name;
        } else{
            System.out.println("Print valid name");
        }

    }

    public int getSize(){
        return size;
    }

    public String getName(){
        return name;
    }

}
