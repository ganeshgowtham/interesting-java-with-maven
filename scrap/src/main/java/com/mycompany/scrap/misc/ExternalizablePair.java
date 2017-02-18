package com.mycompany.scrap.misc;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class ExternalizablePair implements Externalizable {
	private String key;
	private String value;
	
	public ExternalizablePair() {
		this.key = null;
		this.value = null;
	}
	
	public ExternalizablePair(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Pair ";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(key);
		out.writeUTF(value);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.key = in.readUTF();
		this.value = in.readUTF();
	}
	
}


