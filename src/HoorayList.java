public class HoorayList <E>
{
private static final int DEFAULT_CAPACITY = 10;
private int mCapacity;
private int mSize;

private E[] mData;

//Default Constructor
    public HoorayList()
    {
        /*mCapacity = DEFAULT_CAPACITY;
        mSize = 0;
        //Initialize our (mData) array with length 10
        mData = (E[]) new Object[mCapacity];*/
        this(DEFAULT_CAPACITY);

    }

    public HoorayList(int capacity)
    {
        mCapacity = capacity;
        mSize = 0;
        mData = (E[]) new Object[mCapacity];
    }

    public E get(int index)
    {
        if(index<0 || index >= mSize)
        throw new IndexOutOfBoundsException("Index must be >= 0 and < "+mSize);
        return mData[index];
    }
    public E set(int index, E element)
    {
        E temp = this.get(index);
        mData[index] = element;
        return temp;
    }

    public boolean add(E element)
    {
        //Check it is full
        if(mSize>= mCapacity)
        {
            //double capacity
            E[] newData = (E[]) new Object[2* mCapacity];
            //copy all old values to new array
            for (int i = 0; i < mSize; i++)
            {
                newData[i] = mData[i];
            }
            //Update mData to newData
            mData = newData;
            //Update capacity as well
            mCapacity += 2;

        }
        //adds to the end of HoorayList
        mData[mSize++] = element;
        return true;
    }

    public E remove(int index)
    {
      // make a copy of the old element
      E temp = mData[index];
        for (int i = 0; i < mSize; i++)
        {
            mData[i] = mData[i+1];
        }
        //Make size go down by 1
        mSize--;
        return temp;
    }

    public void clear()
    {
        //Start a new Array
        mData = (E[]) new Object[mCapacity];
        
    }

    @Override
    public String toString()
    {
        String output = " [";
        //loop through the array, concatenate all data
        for (int i = 0; i <mSize ; i++)
        {
            output += mData[i] + ",";

        }
        output += "Hooray!]";
        return output;

    }
}
