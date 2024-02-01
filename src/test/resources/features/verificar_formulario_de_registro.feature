#language: es
#Author: lisney villa

Característica: verificar el formulario de registro
  Yo como usuario de demoqa
  Necesito realizar un registro
  Para verificar el registro

  Esquema del escenario: Realizar registro
    Dado que el 'usuario' se encuentra en la pagina principal demoqa
    Cuando el usuario ingrese a la opcion forms
    Y diligencie el formulario datos basicos '<nombre>' '<apellido>''<correo>' '<celular>' '<fecha_nacimiento>'
    Entonces debera ver el '<mensaje>'

    Ejemplos:
      | nombre | apellido | correo              | celular    | fecha_nacimiento | mensaje                        |
      | Lisney | Villa    | lisney005@gmail.com | 3128168966 | 64654s6dfs       | Thanks for submitting the form |

