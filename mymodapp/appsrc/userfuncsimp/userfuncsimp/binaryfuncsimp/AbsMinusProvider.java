package userfuncsimp.binaryfuncsimp;
import userfuncs.binaryfuncs.*;

/**
 * AbsMinusProvider
 */
public class AbsMinusProvider implements BinFuncProvider {
    public BinaryFunc get() {
        return new AbsMinus();
    }
}