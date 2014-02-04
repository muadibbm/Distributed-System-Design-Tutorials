Distributed-System-Design-Tutorials
===================================

Various applications in the field of distributed systems.
Based on COMP 6231 course at Concordia University and The Java Tutorials.

To run the codes (if you have eclipse), just switch your workspace to the repository folder.

Multithreading
--------------

In Multithreading, every thread is assigned a CPU time using context switching.
This is done in a way that seems the threads are executed in parallel but in fact 
concurrent programming is different from parallel programming.
Threads and Processes are two basic units of execution in concurrent programming.
Threads exist within a process. Every process has at least one thread running.
Every thread has a unique identifier. Classes implementing runnable interface do not have
unique identifier but the thread they use has an id.
Thread has several useful methods such as Thread.stop and Thread.start.
Thread.sleep forces the thread to wait for a specific period.
Interrupts are used to notify threads that they have to stop and do something else.
In order to keep the integrity of the data, we have to sometimes synchronize methods in threads.
This can be done using synchronized keyword as in SynchronizedCounter class. 
Note that constructors cannot be synchronized.

UDP Client-Server
-----------------

Computers in networks communicate through two ways TCP and UDP.
UDP (User Datagram Protocal) sends independent packets of data called datagrams from one
computer to another. It is an unreliable method of communication meaning that unlike TCP,
it is not a connection-based protocal. 
Datagram is an independent, self-contained message sent over the network whose arrival,
arrival time and content are not guaranteed.
Ping command which is used to test the connectivity of the network is an example of an 
application that uses UDP. UDP is said to be a datagram-based communication. In UDK the 
datagram packets contains the port number of destination and UDP routes the packet to the
right application.

TCP Client-Server
-----------------

TCP provides a connection-oriented communication between client-server applications.
To communicated over TCP, client and server programs establish a connection using sockets
and then they send and receive packets though them. A socket is a end-point of a two-way
communication link. A socket is bound to a port number so the TCP layer can identify the
application it is connected to. An end-point is a combination of IP address and port number.

Remote Method Invocation
------------------------

In Remote Method Invocation (RMI), an object running in one program can invoke a method on a remote object running in another program. This is
similar to Remote Procedure Call (RPC) but it is extended to work on distributed objects. In Java, RMI provides remote communication
between programs in Java Virtual Machines across a distributed system. 
The basic components of RMI are typically a client which invokes method on a remote object, a server on which the remote object is running
and a RMI registry which registers the remote objects with unique names. For RMI to work, both client and server have to implement the
same Server Object Interface which defines the methods for the remote object running on the server. An object that runs on the client and
acts as a reference to the the remote object on the server is called a Server Stub. In order for the invocation to work, another object should
communicate with both the server stub on the client and the remote object on the server. This object which resides on the server is called
a Server Skeleton.      
For a RMI in Java, the Server Object Interface has to extend the Remote interface. Any remote object has to implement this interface in order
to be able to invoke the methods.
java.rmi.server.UnicastRemoteObject is used for exporting a remote object with Java Remote Method Protocol (JRMP) and obtaining a stub that 
communicates to the remote object.

IDL CORBA
---------

In Development ...