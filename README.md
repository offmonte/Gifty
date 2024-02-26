## Giffty

### Requisitos

- [ ] CRUD Listas
- [ ] CRUD Produtos
- [ ] Encaminhar para a página do link do produto
- [ ] Serviço visualizado por outras pessoas (depois de compartilhar a lista)
- [ ] Autenticação

### Endpoints

#### Listas

- `GET` /lista

  Lista todas as listas cadastradas no sistema.
  
  **Códigos de status**
  
  `200` sucesso

---

- `GET` /lista/{id}

  Retorna os detalhes de uma lista com o `id` informado.
  
  **Códigos de status**
  
  `200` sucesso
  `404` id não encontrado

---

- `POST` /lista

  Cadastrar uma nova lista.

  | Campo | Tipo | Obrigatório | Descrição |
  |-------|------|:-----------:|-----------|
  | nome | string | ✅ | Um nome curto para identificar a lista |
  | descrição | string | ✅ | Uma breve descrição da ocasião que a lista será usada |

  **Códigos de status**
  
  `201` criado com sucesso
  `400` validação falhou

---

- `DELETE` /lista/{id}

  Apaga a lista com o `id` informado.

  **Códigos de status**
  
  `204` apagado com sucesso
  `404` id não encontrado

---

- `PUT` /lista/{id}

  Altera a lista com o `id` informado.

  | Campo | Tipo | Obrigatório | Descrição |
  |-------|------|:-----------:|-----------|
  | nome | string | ✅ | Um nome curto para identificar a lista |
  | descrição | string | ✅ | Uma breve descrição da ocasião que a lista será usada |

  **Códigos de status**
  
  `200` sucesso
  `404` id não encontrado
  `400` validação falhou

---

#### Schema

```js
{
    "id": 1,
    "nome": "Casamento Flávia & Samuel",
    "descrição": "Está lista será compartilhada para convidados do casamento"
}


#### Produtos

- `GET` /produtos

  Lista todos os produtos cadastradas no sistema.
  
  **Códigos de status**
  
  `200` sucesso

---

- `GET` /produto/{id}

  Retorna os detalhes de um produto com o `id` informado.
  
  **Códigos de status**
  
  `200` sucesso
  `404` id não encontrado

---

- `POST` /produto

  Cadastrar um novo produto.

  | Campo | Tipo | Obrigatório | Descrição |
  |-------|------|:-----------:|-----------|
  | nome | string | ✅ | Um nome curto para identificar o produto |
  | icone | string | ✅ | O nome do ícone conforme biblioteca material design |
  | link | string | ✅ | O link do site onde encontrar aquele item |
  | descrição | string | ✅ | Uma breve descrição das informações do produto |

  **Códigos de status**
  
  `201` criado com sucesso
  `400` validação falhou

---

- `DELETE` /produto/{id}

  Apaga o produto com o `id` informado.

  **Códigos de status**
  
  `204` apagado com sucesso
  `404` id não encontrado

---

- `PUT` /produto/{id}

  Altera o produto com o `id` informado.

  | Campo | Tipo | Obrigatório | Descrição |
  |-------|------|:-----------:|-----------|
  | nome | string | ✅ | Um nome curto para identificar o produto |
  | icone | string | ✅ | O nome do ícone conforme biblioteca material design |
  | link | string | ✅ | O link do site onde encontrar aquele item |
  | descrição | string | ✅ | Uma breve descrição das informações do produto |

  **Códigos de status**
  
  `200` sucesso
  `404` id não encontrado
  `400` validação falhou

---

#### Schema

```js
{
    "id": 1,
    "nome": "IPhone 13",
    "icone": "celular",
    "descrição": "Apple 128GB Azul Tela de 6,1”, Câmera Dupla de 12MP",
    "link": "https://www.casasbahia.com.br"
}

