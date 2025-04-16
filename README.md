# 📝 Contest Text Validator

![License](https://img.shields.io/badge/license-MIT-blue.svg)
![Version](https://img.shields.io/badge/version-1.0.0-green.svg)

## 📋 Descrizione
Contest Text Validator è un'applicazione web moderna e intuitiva progettata per semplificare il processo di validazione dei testi inviati per concorsi letterari di poesia e scrittura. L'applicazione automatizza il processo di verifica dei contenuti, assicurando che ogni submission rispetti i criteri stabiliti dal regolamento del concorso.

## ✨ Caratteristiche Principali
- 🔍 **Validazione Intelligente**: Analisi automatica dei file di testo
- 🎨 **Interfaccia User-Friendly**: Design moderno e reattivo
- ⚡ **Prestazioni Ottimizzate**: Elaborazione rapida dei file
- 🔒 **Sicurezza**: Gestione sicura dei file caricati

## 🛠️ Tecnologie Utilizzate
- **Frontend**:
  - React.js
  - TypeScript
  - Material-UI
- **Backend**:
  - Java Spring Boot
  - Maven
  - RESTful API

## 🚀 Installazione

### Prerequisiti
```bash
# Node.js (v14 o superiore)
# Java JDK 11 o superiore
# Maven 3.6 o superiore
```

### Setup Frontend
```bash
# Naviga nella directory frontend
cd frontend

# Installa le dipendenze
npm install

# Avvia il server di sviluppo
npm start
```

### Setup Backend
```bash
# Dalla root del progetto
mvn clean install

# Avvia il server
mvn spring-boot:run
```

## 🔧 Configurazione
Crea un file `.env` nella cartella frontend con le seguenti variabili:
```env
REACT_APP_API_URL=http://localhost:8080/api
REACT_APP_MAX_FILE_SIZE=5242880
```

## 📖 Come Utilizzare

1. **Accesso all'Applicazione**
   - Apri il browser e vai su `http://localhost:3000`

2. **Caricamento File**
   ```javascript
   // Esempio di chiamata API per il caricamento
   const formData = new FormData();
   formData.append('file', yourFile);
   
   fetch('/api/validate', {
     method: 'POST',
     body: formData
   });
   ```

3. **Ricezione Risultati**
   - I risultati della validazione verranno mostrati in formato JSON:
   ```json
   {
     "isValid": true,
     "messages": [],
     "statistics": {
       "wordCount": 500,
       "characterCount": 2500
     }
   }
   ```

## 👥 Target Utenti
- 📚 Organizzatori di concorsi letterari
- ✍️ Partecipanti ai concorsi
- 👥 Staff di pre-selezione

## 🤝 Come Contribuire
Siamo aperti a contributi! Per favore segui questi passi:

1. Fai il fork del repository
2. Crea un nuovo branch: `git checkout -b feature/nuova-feature`
3. Committa le modifiche: `git commit -am 'Aggiungi nuova feature'`
4. Pusha sul branch: `git push origin feature/nuova-feature`
5. Invia una Pull Request

## 📄 Licenza
Questo progetto è sotto licenza MIT. Vedi il file `LICENSE` per maggiori dettagli.

## 📞 Contatti
Per domande o supporto, apri una issue nel repository o contatta il team di sviluppo.

## 🙏 Ringraziamenti
Un ringraziamento speciale a tutti i contributori che hanno reso possibile questo progetto.

---
Fatto con ❤️ per la comunità letteraria