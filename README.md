# ContactManager Application

## Introduction
The **Contact Management System** is a web-based application designed to manage and organize contact information. It allows end users to store, search, and view their contacts, while administrators have additional privileges to import, update, delete, and create new contacts. The system is built using Grails on Groovy, Tomcat, MySQL, and leverages a random user generator REST API for importing contacts.

For API details, visit:
[Random User Generator API Documentation](https://documenter.getpostman.com/view/19878710/2s93Jrwk3R)

## Functional Requirements

### End User Features
1. **User Registration and Login**:
   - Users can register with the system using their email and password.
   - After registration, users can log in to access their contact list.

2. **View Contacts**:
   - Users can view their existing contacts.
   - Contact details include:
     - Name
     - Email
     - Phone
     - Address

3. **Search Contacts**:
   - Users can search for contacts based on Name (partial or full), Email, or Phone number.

### Admin Features
1. **Contact Import Batch using REST API**:
   - Implement a Batch program using Quartz scheduler or Spring batch to import 5000 contacts into the contacts table.

2. **Admin Authentication**:
   - Administrators log in using their credentials.
   - Admins have additional privileges compared to regular users.

3. **Manage Contacts**:
   - **Create Contacts**: Admins can add new contacts.
   - **Update Contacts**: Admins can edit existing contact details.
   - **Delete Contacts**: Admins can remove contacts from the system.

## Non-Functional Requirements

1. **Security**:
   - User passwords are securely hashed and stored.
   - Authentication uses a secure mechanism (e.g., OAuth, JWT) with Spring security.

2. **Performance**:
   - Efficient handling of a large number of contacts.
   - Batch loading optimized for performance, loading 5000 records by paginating 100 records at a time.

3. **Scalability**:
   - The system is scalable to accommodate future growth in users and contacts.

4. **Technology Stack**:
   - Backend: Grails or Groovy
   - Database: MySQL
   - Authentication: Spring Security
   - Batch Processing: Quartz or Spring batch
   - Web Server: Tomcat

5. **Assumptions and Constraints**:
   - Assumes users have basic knowledge of web applications.
   - Relies on the availability and reliability of the external REST API for random user generation.

## Documentation

- [Grails 6.2.0 User Guide](https://docs.grails.org/6.2.0/guide/index.html)
- [API Reference](https://docs.grails.org/6.2.0/api/index.html)
- [Grails Guides](https://guides.grails.org/index.html)
- [Grails Scaffolding Plugin](https://grails.github.io/scaffolding/latest/groovydoc/)
- [Grails Fields Plugin](https://grails-fields-plugin.github.io/grails-fields/latest/guide/index.html)
- [Asset Pipeline Core Documentation](https://www.asset-pipeline.com/manual/)
- [Grails Geb Functional Testing](https://github.com/grails3-plugins/geb#readme)
- [Geb Manual](https://www.gebish.org/manual/current/)

## Glossary

- **End User**: Regular system user with limited privileges.
- **Admin**: System administrator with additional privileges.
