/**
 * Automatically generated by Zserio Java extension version 2.4.2.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package example.calculator;

public class Doubles implements zserio.runtime.io.InitializeOffsetsWriter, zserio.runtime.SizeOf
{
    public Doubles()
    {
    }

    public Doubles(java.io.File file)
            throws java.io.IOException
    {
        final zserio.runtime.io.FileBitStreamReader in = new zserio.runtime.io.FileBitStreamReader(file);
        read(in);
        in.close();
    }

    public Doubles(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public Doubles(zserio.runtime.array.PackingContextNode contextNode, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(contextNode, in);
    }

    public Doubles(
            double[] values_)
    {
        setValues(values_);
    }

    public static void createPackingContext(zserio.runtime.array.PackingContextNode contextNode)
    {
        contextNode.createChild();
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContextNode contextNode)
    {
    }

    @Override
    public int bitSizeOf()
    {
        return bitSizeOf(0);
    }

    @Override
    public int bitSizeOf(long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += values_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContextNode contextNode, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += values_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public double[] getValues()
    {
        return values_.getRawArray();
    }

    public void setValues(double[] values_)
    {
        this.values_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.DoubleRawArray(values_),
                new zserio.runtime.array.ArrayTraits.Float64ArrayTraits(),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof Doubles)
        {
            final Doubles that = (Doubles)obj;

            return
                    ((values_ == null) ? that.values_ == null : values_.equals(that.values_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.Util.HASH_SEED;

        result = zserio.runtime.Util.HASH_PRIME_NUMBER * result +
                ((values_ == null) ? 0 : values_.hashCode());

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        values_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.DoubleRawArray(),
                new zserio.runtime.array.ArrayTraits.Float64ArrayTraits(),
                zserio.runtime.array.ArrayType.AUTO);
        values_.read(in);
    }

    public void read(zserio.runtime.array.PackingContextNode contextNode, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        values_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.DoubleRawArray(),
                new zserio.runtime.array.ArrayTraits.Float64ArrayTraits(),
                zserio.runtime.array.ArrayType.AUTO);
        values_.read(in);
    }

    @Override
    public long initializeOffsets(long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition = values_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContextNode contextNode, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition = values_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    public void write(java.io.File file) throws java.io.IOException
    {
        zserio.runtime.io.FileBitStreamWriter out = new zserio.runtime.io.FileBitStreamWriter(file);
        write(out);
        out.close();
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        write(out, true);
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out, boolean callInitializeOffsets)
            throws java.io.IOException
    {
        values_.write(out);
    }
    
    @Override
    public void write(zserio.runtime.array.PackingContextNode contextNode,
            zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        values_.write(out);
    }

    private zserio.runtime.array.Array values_;
}
