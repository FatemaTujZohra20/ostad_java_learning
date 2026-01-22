
* This Java code demonstrates Object Serialization and Deserialization. In simple terms, serialization is
* the process of converting a Java object into a byte stream (so it can be saved to a file), and deserialization
* is the process of converting those bytes back into a live Java object.
## OR

* This program demonstrates Object Serialization, the process of converting an object's state into a byte stream, 
and Deserialization, the reverse process of recreating the object from that byte stream.
* Note on File Extensions: Although the code names the output file person.json, the data written by ObjectOutputStream 
is binary, not text-based JSON.
---
## Core Concepts Used
------
* Serializable Interface: A "marker interface" (has no methods) that tells the Java Virtual Machine (JVM)
* that this class is allowed to be converted into a byte stream.
*
* ObjectOutputStream: The class used to write the object to a file.
*
* ObjectInputStream: The class used to read the object back from a file.
*
* Try-with-Resources: The try (...) syntax ensures that the file streams are closed automatically,
* preventing memory leaks.

## File Extension:
I used .json as the filename. However, standard Java serialization produces binary data, not readable JSON text. 
It is more common to use .ser or .dat.

## transient Keyword:
If I had a sensitive field (like a password) that I didn't want to save, I would declare it as
transient String password;.

## serialVersionUID:
Always include a private static final long serialVersionUID. If I change the class (e.g., add a new field) after 
saving the file, Java uses this ID to ensure compatibility.

## Serializable
A marker interface that enables the serialization mechanism for the class.

## FileOutputStream
A low-level stream for writing raw bytes to a file.

## ObjectOutputStream
High-level stream that converts Java Objects into bytes.

## writeObject() 
The method that performs the actual conversion and writing.

## readObject()
The method that reads bytes and reconstructs the Object graph.











