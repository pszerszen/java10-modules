module com.osa.modules.workshop.service {
    requires com.osa.modules.service;

    exports com.osa.modules.workshop.service;

    provides com.osa.modules.service.EventService
            with com.osa.modules.workshop.service.WorkshopService;
}