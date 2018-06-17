import com.osa.modules.lt.service.LightningTalkService;

module dev.lt.service {

    requires dev.service;

    exports com.osa.modules.lt.service;

    provides com.osa.modules.service.EventService
            with LightningTalkService;
}
