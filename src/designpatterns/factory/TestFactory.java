package designpatterns.factory;

/**
 * Created by nitlak on 03-10-2017.
 */
public class TestFactory {

}

abstract  class AbstractComputerFactory{
    abstract public Computer getComputer();
}

class PCComputerFactory extends AbstractComputerFactory{
    public Computer getComputer(){
        return new PC();
    }
}

class ServerComputerFactory extends AbstractComputerFactory{
    public Computer getComputer(){
        return new Server();
    }
}



class Computer{

}

class PC extends Computer{

}

class Server extends Computer{

}
