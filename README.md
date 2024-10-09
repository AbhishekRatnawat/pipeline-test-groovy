## pipeline-test-groovy  
**Unit testing framework for Jenkins pipelines written in Groovy. Provides robust testing for Jenkins scripts, stages, and shared libraries.**

### Features:
- **Jenkins Pipeline Unit Testing**: Validate the functionality of your Jenkins pipeline scripts with unit tests, ensuring that stages, steps, and shared libraries perform as expected.
- **Groovy-Based Framework**: Leverage the flexibility and power of Groovy to write and execute unit tests that integrate seamlessly with Jenkins pipelines.
- **Mocking Jenkins Methods Using Expando**:  
  The framework utilizes Groovy's `Expando` to mock Jenkins plugin methods such as `sh`, `readYaml`, `stage`, and `readFile`, enabling tests to simulate Jenkins environment behavior without requiring a live Jenkins instance.
- **Test Shared Libraries**: Ensure that your Jenkins shared libraries are thoroughly tested to avoid runtime issues during pipeline execution.
- **Stage and Step Validation**: Test individual stages and steps in isolation, providing faster feedback on the correctness of pipeline logic.
- **Customizable and Extensible**: Easily customize the testing framework to meet your specific pipeline needs, allowing for testing complex workflows and dynamic pipeline configurations.
- **Closure Testing**: Supports testing of Groovy closures used within pipelines, ensuring that pipeline logic involving closures is handled correctly.
- **Environment Variable Mocks**: Provides support for mocking environment variables (`env`) within the Jenkins script, allowing for flexible testing of different deployment or build scenarios.
- **Simulate Shell Commands**: Mock shell commands (`sh`) and capture their output to ensure proper behavior in build and deployment scripts.

### Example Use Cases:
- **Mocking Jenkins Methods**:  
  Using `Expando`, the class allows dynamic mocking of Jenkins methods such as `sh`, `readYaml`, and `stage`. This helps simulate real Jenkins behavior for testing pipeline logic without relying on actual Jenkins server interactions.
  More about Expando: https://docs.groovy-lang.org/latest/html/api/groovy/util/Expando.html

- **Testing Stages and Parallel Executions**:  
  Test individual stages or parallel execution branches by mocking their behavior and verifying the execution flow of complex pipelines.

- **Simulating File Operations**:  
  Mock file operations like `readFile` to ensure your pipeline handles file input/output correctly, even when those files aren’t available in your test environment.

### Quick Start:
1. **Clone the Repository**:  
   Start by cloning the repository and setting up your development environment.

2. **Write Tests Using Expando**:  
   Use `Expando` objects to dynamically mock Jenkins pipeline methods, and write Groovy unit tests to validate your pipeline scripts.

3. **Run Tests with Gradle**:  
   Easily integrate with Gradle to run your tests and automate the validation of your Jenkins pipeline logic.
