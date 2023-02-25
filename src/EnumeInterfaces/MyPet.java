package EnumeInterfaces;

public enum MyPet implements Pet{

    CAT{
        @Override
        public String talk() {
            return "MiAU";
        }
    },


    MOUSE{
        @Override
        public String talk() {
            return "Squik";
        }
    }

//    @Override
//    public String talk() {
//        return "Sound";
//    }
}
