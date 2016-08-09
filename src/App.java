/**
 * Created by LordwolF on 8/8/2016.
 */
class Machine {
    public void start() {
        System.out.println("Machine Started!");
    }
}

class Camera extends Machine {
    public  void start() {
        System.out.println("Camera Rolling!");
    }

    public void snap() {
        System.out.println("Film Taken");
    }
}

public class App {
    public static void main(String[] args) {


        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        // upcasting taken a camera and moved it up a class to a machine
        Machine machine2 = camera1;
        machine2.start();
        // error --- machine2.snap(); ---

        //downcasting have to specify Camera or it breaks / wont downcast
        //it requires a confirmation
        //downcasting is inherently unsafe. be careful.
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        camera2.snap();
        camera2.start();


        // object is Machine cant just make it a Camera
        //runtime error
        Machine machine4 = new Machine();
        //Camera camera3 = (Camera)machine4;
        //camera3.start();

    }
}
