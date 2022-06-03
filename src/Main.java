import business.DataSourceOptions;
import business.EditionManager;
import business.ManagersTrials.*;
import business.TeamManager;
import presentation.*;
import presentation.controllers.*;

import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException {
        DataSourceOptions dataSourceOptions = null;
        ViewController viewController = new ViewController();
        /**
         * Preguntamos por el tipo de archivo que vamos a usar CSV O JSON
         * Debemos hacer esta parte aqui en el main, ya que si no no podríamos pasar como parametro el dataSourceOptions
         * a todas las clases que lo necesitan
         */
        String option;
        viewController.showMessage("\nThe IEEE needs to know where your allegiance lies.\n");
        viewController.showStartingMenu();

        option = viewController.askForString("Pick a faction: ");
        if (option.equals("I")) {
            dataSourceOptions = DataSourceOptions.CSV;
        } else if (option.equals("II")) {
            dataSourceOptions = DataSourceOptions.JSON;
        }

        /**
         * Constructores
         */
        EditionManager editionManager = new EditionManager(dataSourceOptions);
        TrialsManager trialsManager = new TrialsManager(dataSourceOptions);
        TeamManager teamManager = new TeamManager(dataSourceOptions);

        GameExecutor gameExecutor = new GameExecutor(teamManager, viewController);

        TrialControllerPrueba trialControllerPrueba = new TrialControllerPrueba(viewController, trialsManager);

        CompositorController compositorController = new CompositorController(viewController, editionManager, trialsManager, trialControllerPrueba);
        ConductorController conductorController = new ConductorController(editionManager, teamManager, viewController, gameExecutor, trialsManager);

        /**
         * Le pasamos el tipo al Controller manager
         */
        ControllerManager controllerManager = new ControllerManager(viewController, compositorController, conductorController);
        controllerManager.run(option);
    }
}
