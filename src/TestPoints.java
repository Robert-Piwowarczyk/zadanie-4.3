public class TestPoints {
    public static void main(String[] args) {
        Point pointA = new Point(-2,2);

        System.out.println("Punkt A jest w ćwiartceI:"
                +pointA.setCheckI()+";"+" Punkt A jest w ćwiartceII:"
                +pointA.setCheckII()+";"+" Punkt A jest w ćwiartceIII: "
                +pointA.setCheckIII()+";"+" Punkt A jest w ćwiartceIV: "
                + pointA.setCheckIV());

        System.out.println(" Czy punkt A leży na osi x?:"
                +pointA.setLookForPointOnX()+";"+" Czy punkt A leży na osi y?:"
                +pointA.setLookForPointOnY()+";"+" Czy punkt A leży na przecięciu osi x i osi y?:"
                +pointA.setLookForPointOnCenter());

        Point pointB = new Point (2,2);
        System.out.println("Punkt B jest w ćwiartceI:"
                +pointB.setCheckI()+";"+" Punkt B jest w ćwiartceII:"
                +pointB.setCheckII()+";"+" Punkt B jest w ćwiartceIII: "
                +pointB.setCheckIII()+";"+" Punkt B jest w ćwiartceIV: "
                + pointB.setCheckIV());

        System.out.println(" Czy punkt B leży na osi x?:"
                +pointB.setLookForPointOnX()+";"+" Czy punkt B leży na osi y?:"
                +pointB.setLookForPointOnY()+";"+" Czy punkt B leży na przecięciu osi x i osi y?:"
                +pointB.setLookForPointOnCenter());


    }
}