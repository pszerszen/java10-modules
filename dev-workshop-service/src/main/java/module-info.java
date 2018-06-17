module dev.workshop.service {
    requires dev.service;

    exports com.osa.modules.workshop.service;

    provides com.osa.modules.service.EventService
            with com.osa.modules.workshop.service.WorkshopService;
}
