package dates;

import appCadastroSeminario.Local;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

//USANDO A INTERFACE TENMPORAL ADJUSTER: ajusta o tempo ( não ajusta hora)
//vamos definir uma regra de negocio pq o adjuster so tem 1 metodo

//*VAMOS CRIAR UMA NOVA CLASSE para criando uma regra de negocio, sim é possivel no mesmo arquivo (classe publica só pode ter 1)

class ObterProximoDiaUtil implements TemporalAdjuster {

//metodo abstrato tem que implementar obrigatoriamente
    //criamos uma regra de negocio: na classe main o LocalDate mostrar a data de hoje logo quando criar o objeto
    // dessa classe, implementara essa regra de negocio
    //objetivo: descobrir qual dia é a proxima segunda
    //ex.: se hoje é sexta a regra de negocio adicionara 3 dias, a data de hoje, logo mostrara qual data será a segunda feira
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = 1;
        switch (dayOfWeek){
            case MONDAY: addDays = 7;
            case TUESDAY: addDays = 6;
            case WEDNESDAY: addDays = 5;
            case THURSDAY: addDays = 4; break;
            case FRIDAY: addDays = 3; break;
            case SATURDAY: addDays =2; break;
            default: addDays = 1;
        }

        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}
public class TemporalAdjusterTest {
    public static void main(String[] args) {

        // Criando objeto da classe 'ObterProximoDiaUtil' que criamos acima ele checara qual dia é hoje
        // e implementara a regra de negoico criada ex.: se hoje é sexta ele adicionara 3 dias logo mostrara o dia da segunda
        LocalDate agora = LocalDate.now().with( new ObterProximoDiaUtil());
        System.out.println(agora); // ele ve quando cai dia 15, e implementa a classe da regra de negocio, vendo qual data cai a proxima segunda
        System.out.println(agora.getDayOfWeek()); // qual dia da semana é hoje

        //restartou o dia para a data de hoje, apos mudou a data para dia 15 e depois chamou a classe da regra de negocio
        //para saber qual a data será a proxima segunda apartir dessa nova data
        agora = LocalDate.now().withDayOfMonth(15).with( new ObterProximoDiaUtil());
        System.out.println(agora); // ele ve quando cai dia 15, e implementa a classe da regra de negocio, vendo qual data cai a proxima segunda
        System.out.println(agora.getDayOfWeek()); // qual dia da semana é hoje

    }
}
