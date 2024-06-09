class ChristmasTree {

    private String color;

    public ChristmasTree(String color) {
        this.color = color;
    }

    // create method putTreeTopper()
    void putTreeTopper(String color) {
        System.out.println("Sparkling " + color + " tree topper looks stunning with " + this.color + " Christmas tree!");
    }

    class TreeTopper {

        private String color;        

        public TreeTopper(String color) {
            this.color = color;
        }

        // create method sparkle()
        void sparkle() {
            System.out.println(color);
        }
    }
}

// this code should work
class CreateHoliday {

    public static void main(String[] args) {

        ChristmasTree christmasTree = new ChristmasTree("green");
        christmasTree.putTreeTopper("silver");
    }
}