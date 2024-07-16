class InnerInner{
    public int[] InnerInnerDataArray;
    public int InnerInnerDataSize;

    public InnerInner(int datasize, int[] dataArray){
        this.InnerInnerDataSize = datasize;

        this.InnerInnerDataArray = new int[dataArray.length];
        for (int i=0; i<dataArray.length; i++)
            this.InnerInnerDataArray[i] = dataArray[i];
    }
    public InnerInner(InnerInner innerinner){
        this(innerinner.InnerInnerDataSize, innerinner.InnerInnerDataArray);
    }
}

class Inner{
    public int[] InnerDataArray;
    public int InnerDataSize;
    public InnerInner _innerinner;

    public Inner(int datasize, int[] dataArray, InnerInner _innnerinner){
        this._innerinner = new InnerInner(_innnerinner);

        this.InnerDataSize = datasize;

        this.InnerDataArray = new int[dataArray.length];
        for (int i=0; i<datasize; i++)
            this.InnerDataArray[i] = dataArray[i];
    }

    public Inner(Inner inner){
        this(inner.InnerDataSize, inner.InnerDataArray, inner._innerinner);
    }
}

class Outer{
    public int[] OuterDataArray;
    public int OuterDataSize;
    public Inner _inner;

    public Outer(int datasize, int[] dataArray, Inner inner){
        this._inner = new Inner(inner);

        this.OuterDataSize = datasize;

        this.OuterDataArray = new int[dataArray.length];
        for (int i=0; i<datasize; i++)
            this.OuterDataArray[i] = dataArray[i];
    }

    public Outer(Outer outer){
        this(outer.OuterDataSize, outer.OuterDataArray, outer._inner);
    }
}

public class MultiClass {
    public static void main(String[] args) {
        int[] innerinnerArray = {1, 2, 3, 4, 5};
        InnerInner innerinner = new InnerInner(innerinnerArray.length, innerinnerArray);

        int[] innerArray = {10,20,30,40,50,60,70,80,90};
        Inner inner = new Inner(innerArray.length, innerArray, innerinner);
        
        int[] outerArray = {105,205,305};
        Outer outer = new Outer(outerArray.length, outerArray, inner);

        System.out.println("Outer Data Size: " + outer.OuterDataSize);
        System.out.println("Outer Data Array: ");
        for (int i=0; i<outer.OuterDataSize; i++)
            System.out.print(outer.OuterDataArray[i] + " ");
        System.out.println();

        System.out.println("\nInner Data Size: " + outer._inner.InnerDataSize);
        System.out.println("Inner Data Array: ");
        for (int i=0; i<outer._inner.InnerDataSize; i++)
            System.out.print(outer._inner.InnerDataArray[i] + " ");
        System.out.println();

        System.out.println("\nInnerInner Data Size: " + outer._inner._innerinner.InnerInnerDataSize);
        System.out.println("InnerInner Data Array: ");
        for (int i=0; i<outer._inner._innerinner.InnerInnerDataSize; i++)
            System.out.print(outer._inner._innerinner.InnerInnerDataArray[i] + " ");
        System.out.println();
    }
}
