package guru.springframework.sfg_dependency_injection.services;

// An interface defines the methods that the corresponding implementation has to provide.
// This interface (or its implementation) will be injected in three different ways into to three different controllers.

public interface GreetingService {

    String sayGreeting();
}
