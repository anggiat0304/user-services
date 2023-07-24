pipeline{
    agent any
    stages{
         stage('Build') {
                    steps {
                        // Menggunakan Maven untuk membangun aplikasi Java
                        sh 'mvn clean package'
                    }
                }

                stage('Test') {
                    steps {
                        // Menjalankan unit tests
                        sh 'mvn test'
                    }
                }
    }
}