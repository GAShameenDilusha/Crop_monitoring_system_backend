# POS Backend (Phase 02)
Farm operations become effortless with Crop System, an all-in-one agricultural management system. This dynamic platform equips farmers with essential tools to oversee their fields, track crop progress, maintain equipment records, coordinate staff schedules, manage vehicle fleets, and keep detailed monitoring logs. Thanks to its user-friendly interface and sophisticated permission controls, Crop System helps farms boost their efficiency and make smarter operational decisions.


---
#
## ◽ Features
### **Core Functionalities**
- **Role-Based Access Control**: Control system access through specialized roles including Management, Administrative, and Scientific personnel.
- **Field Management**: Add, update, and monitor field details with images and crop data.
- **Crop Management**: Track crop types, growth stages, and their association with fields.
- **Staff Management**: Manage staff roles, assignments, and responsibilities.
- **Equipment Management**: Allocate and track farm equipment with lifecycle insights.
- **Vehicle Management**: Maintain records of vehicles assigned for agricultural operations.
- **Monitoring Logs**: Record observations and updates related to fields, crops, and equipment.


### **Additional Highlights**
- User-friendly SPA (Single Page Application) interface.
- Integration with a robust Spring Boot backend.
- Secure JWT-based authentication and authorization.
- Relational data modeling with MySQL.



---
#
## ◽Tech Stack

### **Frontend**
- **HTML5, CSS3, JavaScript**
- **Frameworks**: Bootstrap for responsive design
- **AJAX & Fetch API**: For seamless API integration

### **Backend**
- **Spring Boot**: REST API development with Hibernate for ORM
- **MySQL**: Database management
- **JWT**: Secure authentication



---
#
## ◽ Installation Guide

### Prerequisites
1. **Java Development Kit (JDK)** (version 17 or above).
2. **MySQL Server**.
3. **Postman** (optional, for API testing).


### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/GAShameenDilusha/Crop_monitoring_system_backend.git
   cd Crop System
   ```
    ```bash
   git clone https://github.com/GAShameenDilusha/Crop_monitoring_system_front_end.git
   ```
2. Configure the database in the `application.properties` file:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/greenshadow
   spring.datasource.username=your-username
   spring.datasource.password=your-password



   3. Access the application at `http://localhost:3306`.

---
#
##  ◽Role-Based Permissions

**MANAGER**     - Full access to CRUD operations for all entities.     
**ADMINISTRATOR** - Cannot edit crop data, field data, or monitoring logs related to crop details.  
**SCIENTIST**   - Cannot modify staff, vehicle, or equipment data.

#
## ◽Database Structure

The database design ensures efficient relationships between entities such as:
- **Fields and Crops**: Many-to-Many relationship.
- **Staff and Vehicles**: One-to-Many relationship.
- **Fields and Equipment**: One-to-Many relationship.
- **Monitoring Logs**: Tracks updates across multiple entities.




---
#
## ◽API Highlights

### Base URL
`http://localhost:8080/greenShadow/api/v1/`

### Sample Endpoints
- **User Signup**: `POST /auth/signup`
- **Get All Fields**: `GET /fields`
- **Add New Crop**: `POST /crops`
- **Update Equipment**: `PUT /equipments/{equipmentId}`


---
#
## ◽License

This project is licensed under the MIT License. See the `LICENSE` file for details.


---
#
##  Acknowledgments

Special thanks to all  mentors for their guidance and support.

---
**Crop System - Revolutionizing Farm Management**