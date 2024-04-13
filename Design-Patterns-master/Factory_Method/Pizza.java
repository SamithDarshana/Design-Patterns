package Factory_Method;

public abstract class Pizza {

        void pizzaMethods(){
              prepare();
              bake();
              cut();
              box();
        }
        abstract void prepare();
        abstract void bake();
        abstract void cut();
        abstract void box();




}
