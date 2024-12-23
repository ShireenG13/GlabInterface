


    public abstract class Shape{
        protected  String color;
        protected double height;
        protected double width;
        protected double base;

        public void setColor(String color) {
            this.color = color;
        }
        public void setHeight(double height) {
            this.height = height;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public void setBase(double base) {
            this.base = base;
        }

        //The getArea metjod is abstract
        //It must be overriden in a subclass
        //All Shapes must provide amethod called getArea().
        public abstract double getArea();
        //returns a self-descriptive string


        @Override
        public String toString() {
            return "Shape{" +
                    "color='" + color + '\'' +
                    '}';
        }

        public void displayShapeName(){
            System.out.println("I am a Shape");
        }
    }



