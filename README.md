# LoadBalancer

A Java-based Round Robin Load Balancer that distributes incoming requests evenly across multiple servers using a simple rotation algorithm.

## Why I Built This

I built this project to get a better understanding of how requests are distributed across servers. Load balancing is a common concept in backend systems, and this was a simple way to explore how the Round Robin algorithm works in practice using Java.

## Features

* Round Robin request distribution
* Dynamic server addition
* Even workload distribution across servers
* Circular server rotation
* Lightweight and easy-to-understand implementation
* Object-oriented design using separate classes

## Technologies Used

* Java
* Java Collections Framework
* ArrayList
* Object-Oriented Programming (OOP)

## How to Run

1. Clone the repository

```bash
git clone https://github.com/JavaLabs-io/LoadBalancer.git
```

2. Open the project in VS Code or any Java IDE

3. Run `Main.java`

## Sample Output

```text
Added: Server A
Added: Server B
Added: Server C

Request 1 -> Server A
Request 2 -> Server B
Request 3 -> Server C
Request 4 -> Server A
Request 5 -> Server B
Request 6 -> Server C
```

## Future Improvements

- Remove server functionality
- Weighted Round Robin implementation
- Server health checks
-  REST API integration

## Part of JavaLabs-IO

This project is part of JavaLabs-IO — a collection of Java backend systems, simulations, tools, and experimental software projects.
