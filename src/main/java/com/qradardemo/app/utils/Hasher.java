package com.qradardemo.app.utils;

public interface Hasher {
    String hash(String decoded);
	boolean compare(String decoded, String hashed);
}
