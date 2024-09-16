# DevRank

DevRank is a platform designed to rank software developers who are openly searching for job opportunities. By leveraging verified educational achievements, certifications, and completed evaluations, DevRank provides a transparent and merit-based ranking system. This enables developers to showcase their skills effectively and helps employers find the best candidates based on specific criteria.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Contribution Guidelines](#contribution-guidelines)
- [Contact](#contact)

## Features

- **Verified Achievements**: Integrate with degree verification APIs and certification platforms to authenticate developers' credentials.
- **Skill Evaluations**: Offer evaluations and badge systems to test and display proficiency in various languages, frameworks, and problem-solving skills.
- **Ranked Listings**: Generate ranked lists of candidates filterable by salary requirements, tech stack, and location preferences.
- **Employer Tools**: Provide employers with advanced search and filter options to find the best active candidates.

## Technologies Used

- **Backend**:
  - Java 21
  - Spring Boot
  - Project Lombok
  - MapStruct
  - PostgreSQL
- **Frontend**:
  - React

## Getting Started

### Prerequisites

- **Java 21**: Ensure that Java Development Kit (JDK) 21 is installed.
- **PostgreSQL**: Install PostgreSQL for the database.
- **Node.js and npm**: Required for running the React frontend.

### Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/DeveloperRanker/DevRank
   cd DevRank
   ```

2. **Backend Setup**

   - Navigate to the backend directory:

     ```bash
     cd devrank-backend
     ```

   - Install dependencies and build the project:

     ```bash
     ./mvnw clean install
     ```

   - Run the Spring Boot application:

     ```bash
     ./mvnw spring-boot:run
     ```

3. **Frontend Setup**

   - Navigate to the frontend directory:

     ```bash
     cd ../frontend
     ```

   - Install dependencies:

     ```bash
     npm install
     ```

   - Start the React application:

     ```bash
     npm start
     ```

4. **Access the Application**

   - Open your browser and navigate to `http://localhost:3000` to view the application.

## Contribution Guidelines

We welcome contributions from the community. To maintain a respectful and collaborative environment, please adhere to the following guidelines:

- **Code Style**: Follow the existing code style and conventions.
- **Naming Conventions**: Avoid profanity or inappropriate language in naming conventions.
- **Pull Requests**: Submit pull requests for any changes, and ensure that all checks pass before requesting a review.

## Contact

For questions or suggestions, please reach out:

- **Larry Devin Carter**
- Phone: (615) 388-4562
- Email: [larrydevincarter@gmail.com](mailto:larrydevincarter@gmail.com)
