# Repository Guidelines

## Project Structure & Module Organization
This repository is a Maven multi-module Java monolith.

- `payc-server/`: Spring Boot startup module and runtime container (`YudaoServerApplication`).
- `payc-framework/`: shared starters and infrastructure extensions (web, security, mybatis, redis, mq, job, etc.).
- `payc-module-*/`: business domains (for example `system`, `infra`, `pay`, `erp`, `iot`).
- `payc-dependencies/`: BOM-style dependency/version management.
- `sql/`: database initialization scripts by database engine.
- `script/`: Docker, deployment, and CI helper scripts.
- `yudao-ui/`: frontend projects (separate build/runtime lifecycle).

Backend code follows layered packages inside each module:
`controller` -> `service` -> `dal` (`mysql`/`redis` + `dataobject`), with `convert`, `api`, `mq`, and `job` as needed.

## Build, Test, and Development Commands
- `mvn clean install -DskipTests`: full build for all enabled modules.
- `mvn clean test`: run all unit tests.
- `mvn -pl payc-server -am spring-boot:run -Dspring-boot.run.profiles=local`: run backend locally with dependent modules.
- `mvn -pl payc-module-system -am test`: run tests for one module and its dependencies.

Run commands from repository root unless a module-specific workflow is required.

## Coding Style & Naming Conventions
- Java 17, UTF-8, 4-space indentation.
- Follow existing package prefix: `cn.net.payc`.
- Class naming conventions:
  - persistence objects: `*DO`
  - request/response objects: `*ReqVO`, `*RespVO`
  - cross-module transfer: `*DTO`
  - mappers/services: `*Mapper`, `*Service`, `*ServiceImpl`
- Prefer constructor/field injection patterns already used in the module; keep consistency over personal preference.
- Use MapStruct/Bean conversion patterns already present in `convert` packages.

## Testing Guidelines
- Test framework stack: JUnit 5 + Mockito (managed in `payc-dependencies`).
- Test source path: `src/test/java` under each module.
- Naming: mirror production class with `*Test` suffix (for example `AdminUserServiceImplTest`).
- Focus tests on service-layer business logic, permission boundaries, and data-access edge cases.

## Commit & Pull Request Guidelines
- Follow Conventional Commit style seen in history: `feat(scope): ...`, `fix(scope): ...`.
- Keep commits small and scoped to one concern/module.
- PRs should include:
  - change summary and affected modules
  - DB/script changes (if any) under `sql/`
  - verification steps (commands run, test scope)
  - screenshots only for UI changes in `yudao-ui/`

## Security & Configuration Tips
- Never commit real secrets in `application-*.yaml`.
- Prefer `application-local.yaml` or environment variables for local credentials.
- Review `sql/` and config diffs carefully when changing tenancy, permissions, or authentication behavior.
