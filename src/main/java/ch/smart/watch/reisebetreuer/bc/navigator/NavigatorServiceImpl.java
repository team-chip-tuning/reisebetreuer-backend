package ch.smart.watch.reisebetreuer.bc.navigator;

import ch.smart.watch.reisebetreuer.bc.navigator.model.Navigator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NavigatorServiceImpl implements NavigatorService {

    private final List<Navigator> navigatorList;

    public NavigatorServiceImpl() {
        this.navigatorList = new ArrayList<>();
    }

    @Override
    public Navigator getNavigatorById(Long id) {
        var findNavigator = navigatorList
                .parallelStream()
                .filter(navigator -> navigator.getId().equals(id))
                .findFirst();
        return findNavigator.isPresent() ? findNavigator.get() : Navigator.builder().build();
    }
}
