package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void encode(IEncoder encoder) throws IOException {
        encoder.encode();
    }
    public static void main(String[] args) throws IOException
    {
        EncodingModuleClient.encode(new FilesEncoder());
        EncodingModuleClient.encode(new NetworkDatabaseEncoder());
    }
}
