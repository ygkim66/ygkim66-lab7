public class TypeB extends Thing{
    public TypeB(){
        super();
    }


    public void maybeTurn(){
        super.maybeTurn();;
        setTime(getTime() + 1);
        if (getTime() == 10)
            setTime(0);
    }
}
