package com.epam.mysite.util.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Date;

public class UnixEpochDateTypeAdapter extends TypeAdapter<Date> {

    private static final TypeAdapter<Date> unixEpochDateTypeAdapter = new UnixEpochDateTypeAdapter();

    private UnixEpochDateTypeAdapter() {
    }

    static TypeAdapter<Date> getUnixEpochDateTypeAdapter() {
        return unixEpochDateTypeAdapter;
    }

    @Override
    public Date read(final JsonReader in)
            throws IOException {
        // this is where the conversion is performed
        return new Date(in.nextLong());
    }

    @Override
    @SuppressWarnings("resource")
    public void write(final JsonWriter out, final Date value)
            throws IOException {
        // write back if necessary or throw UnsupportedOperationException
        out.value(value.getTime());
    }

}