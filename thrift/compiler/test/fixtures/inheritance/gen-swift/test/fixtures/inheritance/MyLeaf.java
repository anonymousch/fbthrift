package test.fixtures.inheritance;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.service.*;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.*;
import java.util.*;

@ThriftService("MyLeaf")
public interface MyLeaf extends test.fixtures.inheritance.MyNode
{
    @ThriftService("MyLeaf")
    public interface Async extends test.fixtures.inheritance.MyNode.Async
    {
        @ThriftMethod(value = "do_leaf")
        ListenableFuture<Void> doLeaf(
        );
    }
    @ThriftMethod(value = "do_leaf")
    void doLeaf(
    );

}
