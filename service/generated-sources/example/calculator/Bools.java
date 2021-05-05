/**
 * Automatically generated by Zserio Java extension version 2.2.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package example.calculator;

public class Bools implements zserio.runtime.io.InitializeOffsetsWriter, zserio.runtime.SizeOf
{
    public Bools()
    {
    }

    public Bools(java.io.File file)
            throws java.io.IOException, zserio.runtime.ZserioError
    {
        final zserio.runtime.io.FileBitStreamReader in = new zserio.runtime.io.FileBitStreamReader(file);
        read(in);
        in.close();
    }

    public Bools(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException, zserio.runtime.ZserioError
    {
        read(in);
    }

    public Bools(
        zserio.runtime.array.BoolArray values_)
    {
        setValues(values_);
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

        endBitPosition += getValues().bitSizeOfAuto(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public zserio.runtime.array.BoolArray getValues()
    {
        return this.values_;
    }

    public void setValues(zserio.runtime.array.BoolArray values_)
    {
        this.values_ = values_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof Bools)
        {
            final Bools that = (Bools)obj;

            return
                    ((this.values_ == null) ? that.values_ == null : this.values_.equals(that.values_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.Util.HASH_SEED;

        result = zserio.runtime.Util.HASH_PRIME_NUMBER * result +
                ((this.values_ == null) ? 0 : this.values_.hashCode());

        return result;
    }

    public void read(final zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException, zserio.runtime.ZserioError
    {
        this.values_ = new zserio.runtime.array.BoolArray(in,
                zserio.runtime.array.Array.AUTO_LENGTH);
    }

    public long initializeOffsets(long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition = getValues().initializeOffsetsAuto(endBitPosition);

        return endBitPosition;
    }

    public void write(java.io.File file) throws java.io.IOException, zserio.runtime.ZserioError
    {
        zserio.runtime.io.FileBitStreamWriter out = new zserio.runtime.io.FileBitStreamWriter(file);
        write(out);
        out.close();
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException, zserio.runtime.ZserioError
    {
        write(out, true);
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out, boolean callInitializeOffsets)
            throws java.io.IOException, zserio.runtime.ZserioError
    {
        getValues().writeAuto(out);
    }

    private zserio.runtime.array.BoolArray values_;
}
