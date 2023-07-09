### AddressController

#### Dependencies

- `AddressService`: The service class for handling address-related operations.

#### Endpoints

- `GET /address`: Retrieves all addresses.
- `GET /address/{id}`: Retrieves an address by its ID.
- `POST /address`: Creates a new address.
- `PUT /address/{id}/city/{city}`: Updates the city of an address by its ID.
- `DELETE /address/{id}`: Deletes an address by its ID.

#### Annotations

- `@RestController`: Specifies that this class is a controller component that handles RESTful requests.
- `@Autowired`: Enables automatic dependency injection of the `AddressService` instance.

#### Endpoint Implementations

- `getAllAddress()`: Handles the `GET /address` request and returns a list of all addresses.
- `getAddressById(Long id)`: Handles the `GET /address/{id}` request and retrieves an address by its ID.
- `addAddress(Address address)`: Handles the `POST /address` request and creates a new address.
- `updateAddressCity(Long id, String city)`: Handles the `PUT /address/{id}/city/{city}` request and updates the city of an address by its ID.
- `deleteAddressById(Long id)`: Handles the `DELETE /address/{id}` request and deletes an address by its ID.

Please note that this Markdown representation provides a summary of the `AddressController` class and its endpoints, including the HTTP methods, request mappings, and the corresponding method implementations.

### EmployeeController

#### Dependencies

- `EmployeeService`: The service class for handling employee-related operations.

#### Endpoints

- `GET /employee`: Retrieves all employees.
- `GET /employee/empId/{empId}`: Retrieves an employee by their ID.
- `POST /employee`: Creates a new employee.
- `PUT /employees/{id}/employeeName/{fName}`: Updates an employee's name by their ID.
- `DELETE /employees/{id}`: Deletes an employee by their ID.

#### Annotations

- `@RestController`: Specifies that this class is a controller component that handles RESTful requests.
- `@Autowired`: Enables automatic dependency injection of the `EmployeeService` instance.

#### Endpoint Implementations

- `getAllEmployee()`: Handles the `GET /employee` request and returns a list of all employees.
- `getEmployee(Long empId)`: Handles the `GET /employee/empId/{empId}` request and retrieves an employee by their ID.
- `addEmployee(Employee employee)`: Handles the `POST /employee` request and creates a new employee.
- `updateEmployeeById(Long id, String fName, Address address)`: Handles the `PUT /employees/{id}/employeeName/{fName}` request and updates an employee's name by their ID.
- `deleteEmployee(Long id)`: Handles the `DELETE /employees/{id}` request and deletes an employee by their ID.

Please note that this Markdown representation provides a summary of the `EmployeeController` class and its endpoints, including the HTTP methods, request mappings, and the corresponding method implementations.
