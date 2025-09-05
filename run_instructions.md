# AI Data Annotation & Labeling CRUD Application
This document explains how to set up and run the project locally on **Windows 11** and **Ubuntu 22.04**. The project uses Python for AI-related tasks and Java (Spring Boot) for CRUD operations.

---

## **Prerequisites**

### **Windows 11**
1. **Python 3.12+**
   - Download from [Python.org](https://www.python.org/downloads/)
   - During installation, check **“Add Python to PATH”**
2. **Java 17 or 21**
   - Download from [Adoptium](https://adoptium.net/)
   - Set `JAVA_HOME` environment variable
3. **Maven 3.9+**
   - Download from [Maven](https://maven.apache.org/download.cgi)
   - Add `MAVEN_HOME` and `bin` to PATH
4. **MySQL 8+**
   - Install MySQL Community Server
   - Create a database for the project, e.g., `ai_annotation_db`
5. **PowerShell Execution Policy**
   ```powershell
   Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope CurrentUser
