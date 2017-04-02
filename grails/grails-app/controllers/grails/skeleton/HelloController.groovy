package asia.grails.tutorial
class HelloController {
    def index() {
        Person person = new Person(firstName: 'John', lastName:'Doe', age:55)
        [ person:person ]
    }
}
