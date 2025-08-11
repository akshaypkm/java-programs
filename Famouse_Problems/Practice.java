package Famouse_Problems;
class A extends Thread{
    public void run(){
        sayHi();

    }
    private void sayHi(){
        for(int i = 0; i< 50;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        sayHello();
    }
    private void sayHello(){
        for(int i = 0; i< 50;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Practice{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}