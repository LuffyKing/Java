package userfuncsimp.binaryfuncsimp;
import userfuncs.binaryfuncs.*;

/**
 * AbsPlusProvider
 */
public class AbsPlusProvider implements BinFuncProvider {
    public BinaryFunc get() {
        return new AbsPlus();
    }
}