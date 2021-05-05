/**
 * Automatically generated by Zserio Java extension version 2.2.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package example.calculator;

public class EnumWrapper implements zserio.runtime.io.InitializeOffsetsWriter, zserio.runtime.SizeOf
{
    public EnumWrapper()
    {
    }

    public EnumWrapper(java.io.File file)
            throws java.io.IOException, zserio.runtime.ZserioError
    {
        final zserio.runtime.io.FileBitStreamReader in = new zserio.runtime.io.FileBitStreamReader(file);
        read(in);
        in.close();
    }

    public EnumWrapper(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException, zserio.runtime.ZserioError
    {
        read(in);
    }

    public EnumWrapper(
        example.calculator.Enum value_)
    {
        setValue(value_);
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

        endBitPosition += getValue().bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public example.calculator.Enum getValue()
    {
        return this.value_;
    }

    public void setValue(example.calculator.Enum value_)
    {
        this.value_ = value_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof EnumWrapper)
        {
            final EnumWrapper that = (EnumWrapper)obj;

            return
                    ((this.value_ == null) ? that.value_ == null : this.value_.getValue() == that.value_.getValue());
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.Util.HASH_SEED;

        result = zserio.runtime.Util.HASH_PRIME_NUMBER * result +
                ((this.value_ == null) ? 0 : this.value_.hashCode());

        return result;
    }

    public void read(final zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException, zserio.runtime.ZserioError
    {
        this.value_ = example.calculator.Enum.readEnum(in);
    }

    public long initializeOffsets(long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += getValue().bitSizeOf(endBitPosition);

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
        getValue().write(out, false);
    }

    private example.calculator.Enum value_;
}