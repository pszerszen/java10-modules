import com.osa.modules.lt.service.LightningTalkService;

module com.osa.module.lt.service {

    requires com.osa.modules.service;

    exports com.osa.modules.lt.service;

    provides com.osa.modules.service.EventService
            with LightningTalkService;
}