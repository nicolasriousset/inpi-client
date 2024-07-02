# inpi-client
Client JAVA pour la version 2 des API INPI

La documentation de l'API INPI est disponible [ici](https://www.inpi.fr/sites/default/files/documentation%20technique%20API%20formalit%C3%A9s_v13.pdf)
 
La documentation concernant les actes est disponible [ici](https://www.inpi.fr/sites/default/files/documentation%20technique%20API%20Actes%20v1.1.pdf)

## Environnement de développement

1. Installer VS Code avec les extensions Java
2. Installer gnupg pour pouvoir publier une nouvelle version de la librairie sur les repos Maven : https://gpg4win.org/download.html
3. Importer dans Kleopatra le certificat de signature des binaires (clé publique et clé privée / secret)
4. Créer un access token depuis https://s01.oss.sonatype.org/#profile;User%20Token et le paramétrer dans "C:\Users\[username]]\.m2\settings.xml", pour lserver avec l'id osossrh
5. Exécuter "./deploy.ps1", ou "mvn clean deploy"
