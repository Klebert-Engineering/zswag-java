/**
 * Automatically generated by Zserio Java extension version 2.4.2.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package example.calculator;

public class EnumWrapper implements zserio.runtime.io.InitializeOffsetsWriter, zserio.runtime.SizeOf
{
    public EnumWrapper()
    {
    }

    public EnumWrapper(java.io.File file)
            throws java.io.IOException
    {
        final zserio.runtime.io.FileBitStreamReader in = new zserio.runtime.io.FileBitStreamReader(file);
        read(in);
        in.close();
    }

    public EnumWrapper(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public EnumWrapper(zserio.runtime.array.PackingContextNode contextNode, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(contextNode, in);
    }

    public EnumWrapper(
            example.calculator.Enum value_)
    {
        setValue(value_);
    }

    public static void createPackingContext(zserio.runtime.array.PackingContextNode contextNode)
    {
        example.calculator.Enum.createPackingContext(contextNode.createChild());
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContextNode contextNode)
    {
        value_.initPackingContext(contextNode.getChildren().get(0));
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

        endBitPosition += value_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContextNode contextNode, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += value_.bitSizeOf(contextNode.getChildren().get(0),
                endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public example.calculator.Enum getValue()
    {
        return value_;
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
                    ((value_ == null) ? that.value_ == null : value_.getValue() == that.value_.getValue());
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.Util.HASH_SEED;

        result = zserio.runtime.Util.HASH_PRIME_NUMBER * result +
                ((value_ == null) ? 0 : value_.hashCode());

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        value_ = example.calculator.Enum.readEnum(in);
    }

    public void read(zserio.runtime.array.PackingContextNode contextNode, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        value_ = example.calculator.Enum.readEnum(contextNode.getChildren().get(0), in);
    }

    @Override
    public long initializeOffsets(long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += value_.bitSizeOf(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContextNode contextNode, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition = value_.initializeOffsets(contextNode.getChildren().get(0),
                endBitPosition);

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
        value_.write(out, false);
    }
    
    @Override
    public void write(zserio.runtime.array.PackingContextNode contextNode,
            zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        value_.write(contextNode.getChildren().get(0), out);
    }

    private example.calculator.Enum value_;
}
