# Implementación de un sistema de monitoreo de transacciones financieras

El sistema debe registrar transacciones financieras provenientes de múltiples orígenes (banca, fintech, seguros) en tiempo real. Cada transacción tiene un identificador único, monto, fecha y origen. El sistema debe manejar flujos de eventos de manera resiliente, escalable y confiable. Debe asegurar que las transacciones se procesen en orden y que no se pierdan eventos ante fallos temporales de alguno de los orígenes.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | programación reactiva |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 12 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Registro de transacciones en tiempo real

**Objetivo:** Implementar la funcionalidad básica de registro de transacciones provenientes de diferentes orígenes.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Identificar los diferentes orígenes de transacciones y sus características.
- Diseñar un mecanismo para registrar las transacciones en tiempo real, asegurando que se mantenga el orden de llegada y que no se pierdan eventos ante fallos temporales de alguno de los orígenes.

**Entregable:** Sistema que registra transacciones financieras provenientes de diferentes orígenes en tiempo real, manteniendo el orden de llegada y la resiliencia ante fallos temporales.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de operadores de Project Reactor para manejar los flujos de eventos.
- Piensa en cómo asegurar la confiabilidad y escalabilidad del sistema.

</details>

### Fase 2: Manejo de errores y resiliencia

**Objetivo:** Implementar mecanismos para manejar errores y asegurar la resiliencia del sistema ante fallos temporales de alguno de los orígenes.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Identificar los posibles errores que pueden ocurrir durante el registro de transacciones.
- Diseñar mecanismos para manejar estos errores y asegurar que el sistema sea resiliente ante fallos temporales de alguno de los orígenes.

**Entregable:** Sistema que registra transacciones financieras provenientes de diferentes orígenes en tiempo real, manteniendo el orden de llegada y la resiliencia ante fallos temporales, con mecanismos implementados para manejar errores.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de operadores de Project Reactor para manejar los errores y asegurar la resiliencia del sistema.
- Piensa en cómo garantizar que las transacciones no se pierdan ante fallos temporales de alguno de los orígenes.

</details>

### Fase 3: Escalabilidad y optimización

**Objetivo:** Implementar mejoras para asegurar la escalabilidad y optimización del sistema.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Identificar posibles puntos de mejora para asegurar la escalabilidad y optimización del sistema.
- Implementar las mejoras identificadas para asegurar que el sistema pueda manejar un mayor volumen de transacciones sin degradar su rendimiento.

**Entregable:** Sistema optimizado y escalable que registra transacciones financieras provenientes de diferentes orígenes en tiempo real, manteniendo el orden de llegada y la resiliencia ante fallos temporales, con mecanismos implementados para manejar errores.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de operadores de Project Reactor para mejorar la escalabilidad y optimización del sistema.
- Piensa en cómo garantizar que el sistema pueda manejar un mayor volumen de transacciones sin degradar su rendimiento.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son los operadores de Project Reactor y cómo se utilizan para manejar flujos de eventos?
- **paraQueSirve**: ¿Para qué sirve el sistema de monitoreo de transacciones financieras y cómo se asegura su resiliencia y escalabilidad?
- **comoSeUsa**: ¿Cómo se utilizan los operadores de Project Reactor para implementar la funcionalidad básica de registro de transacciones y manejar errores?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir durante el registro de transacciones y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de un sistema de monitoreo de transacciones financieras resiliente y escalable?

## Criterios de Evaluacion

- Implementación de la funcionalidad básica de registro de transacciones en tiempo real.
- Implementación de mecanismos para manejar errores y asegurar la resiliencia del sistema.
- Implementación de mejoras para asegurar la escalabilidad y optimización del sistema.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
